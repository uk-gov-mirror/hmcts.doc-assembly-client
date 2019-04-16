package uk.gov.hmcts.reform.docassembly.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.EqualsAndHashCode;

@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@EqualsAndHashCode
public class DocAssemblyRequest {
    private String outputType;

    private String templateId;

    private Object formPayload;
}
