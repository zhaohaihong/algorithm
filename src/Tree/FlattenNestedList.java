package Tree;

import common.NestedInteger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlattenNestedList {
    public static class NestedIterator implements Iterator<Integer> {
        private Iterator<Integer> it;

        public NestedIterator(List<NestedInteger> nestedList) {
            List<Integer> list = new ArrayList<>();
            for (NestedInteger ni : nestedList) {
                traverse(ni, list);
            }
            this.it = list.iterator();
        }

        @Override
        public Integer next() {
            return it.next();
        }

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        public void traverse(NestedInteger nestedInteger, List<Integer> list) {
            if (nestedInteger.isInteger()) {
                list.add(nestedInteger.getInteger());
                return;
            }
            for (NestedInteger ni : nestedInteger.getList()) {
                traverse(ni, list);
            }
        }
    }
}
