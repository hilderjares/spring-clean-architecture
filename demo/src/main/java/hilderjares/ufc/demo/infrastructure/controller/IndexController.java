package hilderjares.ufc.demo.infrastructure.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonEncoding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private static HashMap jsonResponse;

    public IndexController() {
        jsonResponse = new HashMap<>();
    }

    @GetMapping("/")
    public HashMap index() {

        jsonResponse.put("nome", "test");

        return jsonResponse;
    }
}