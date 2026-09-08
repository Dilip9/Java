package gouri.JL.JLException;

import gouri.JL.enums.Branches;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class JLUser {

    private String username;
    private String email;
    private String contactNumber;
    private UUID SSN;

    private Branches branch;

}
