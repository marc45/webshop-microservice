package project.webshop.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import project.webshop.model.Inventory;
import project.webshop.service.InventoryService;


@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    InventoryService inventoryService;

    @RequestMapping(value = "/{productId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Inventory> getInventory(@PathVariable("productId") UUID productId) {

        return new ResponseEntity<Inventory>(inventoryService.getInventory(productId),HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes =MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Inventory> createInventory(@RequestBody  Inventory inventory) {
        return new ResponseEntity<Inventory>(inventoryService.createInventory(inventory),HttpStatus.CREATED);
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Inventory> deleteAllInventory() {
        inventoryService.deleteAllInventory();
        return new ResponseEntity<Inventory>(HttpStatus.OK);
    }

    // find all
    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Inventory>> getAllInventory() {

        return new ResponseEntity<List<Inventory>>(inventoryService.getAll(),HttpStatus.OK);
    }


}
