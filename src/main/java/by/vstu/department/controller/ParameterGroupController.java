package by.vstu.department.controller;

import by.vstu.department.dto.ParameterGroupDTO;
import by.vstu.department.model.enums.ParameterGroupType;
import by.vstu.department.service.ParameterGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/group")
public class ParameterGroupController {

    private final ParameterGroupService service;

    @GetMapping
    public Page<ParameterGroupDTO> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/{type}")
    public List<ParameterGroupDTO> findByType(@PathVariable String type) {
        return service.findByType(ParameterGroupType.valueOf(type));
    }
}
