package boilerplate;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor()
@Builder
@Getter
@Setter
@ToString
public class Person {
    @NonNull private String name;
    @NonNull private int age;
    boolean married = false;
}
