package uz.najottalim.springbootonetomnymanytomany.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class TagResponseDto {

    private Long id;
    private String name;
}
