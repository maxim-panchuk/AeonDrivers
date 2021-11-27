package com.backend.aeondrivers.trip;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Destination {
    private String city;
    private String district;
    private String street;
    private String house;
}
