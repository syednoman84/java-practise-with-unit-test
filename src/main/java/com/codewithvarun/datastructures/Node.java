package com.codewithvarun.datastructures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Node<T> {
    private T value;
    private Node<T> next;
}
