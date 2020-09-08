package ifrn.eliezio.simplekart.simplekart.resources.exceptions;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandardError implements Serializable{
    private static final long serialVersionUID = 1L;

    public Integer status;
    public String message;
    public Long timestamp;


}
