package com.codewithvarun.datastructures.dlinkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DNode<T> {
    private DNode<T> prev;
    private T data;
    private DNode<T> next;
}
