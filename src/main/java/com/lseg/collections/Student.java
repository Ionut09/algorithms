package com.lseg.collections;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@EqualsAndHashCode //ca sa evite inconsistente ale contractului dintre equals si hashcode
@ToString
@Data
@Builder
public class Student {//implements Comparable<Student> {

//    @EqualsAndHashCode.Exclude
    private int age;

    @Getter
    @NonNull
    private String name;

    /**
     * compare bu name ascending then by age descending
     */
//    @Override
//    public int compareTo(Student other) {
//        int compareByName = this.name.compareTo(other.name);
//        if (compareByName == 0) {
//            return Integer.valueOf(this.age).compareTo(other.age) * (-1);
//        }
//        return compareByName;
//    }
}

