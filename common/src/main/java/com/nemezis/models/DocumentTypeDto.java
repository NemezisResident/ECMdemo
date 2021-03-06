package com.nemezis.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Nemezis on 08.06.2019.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentTypeDto extends ResourceSupport {

    private Long documentTypeId;
    private String type;
    private String text;
}
