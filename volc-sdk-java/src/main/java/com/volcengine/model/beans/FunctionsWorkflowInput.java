package com.volcengine.model.beans;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class FunctionsWorkflowInput {
    @JSONField(name = "TemplateId")
    String templateId;
}