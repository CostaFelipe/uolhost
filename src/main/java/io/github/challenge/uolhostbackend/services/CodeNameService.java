package io.github.challenge.uolhostbackend.services;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.Getter;

@Service
@Getter
public class CodeNameService {

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private Environment env;


}
