package com.example;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.micronaut.core.annotation.Introspected;

@Introspected
@JacksonXmlRootElement(namespace = "my", localName = "xml")
public class MyXml {

    @JacksonXmlProperty(localName = "content")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "MyXml{" +
                "content='" + content + '\'' +
                '}';
    }
}
