package gouri.JL.JLException;

import gouri.JL.utility.JLStatusCode;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Result {

    public String message;
    public JLStatusCode statusCode;
    public String path;
    public String traceId;
    public String errorCode;
    public Instant timestamp;
}
