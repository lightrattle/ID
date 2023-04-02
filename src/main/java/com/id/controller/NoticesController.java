package com.id.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notices", method={RequestMethod.GET, RequestMethod.POST})
@EnableAutoConfiguration
public class NoticesController {
}
