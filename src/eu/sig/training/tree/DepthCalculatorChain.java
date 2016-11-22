package eu.sig.training.tree;

public abstract class DepthCalculatorChain {

    private DepthCalculatorChain next;

    public DepthCalculatorChain(final DepthCalculatorChain next) {
        this.next = next;
    }

    public final int calculate(BinaryTreeNode<Integer> node, int nodeValue){
        if(isCalculateConditionFulfilled(node, nodeValue)) {
            return calculateLogic(node, nodeValue);
        }
        if(next != null){
            return next.calculate(node, nodeValue);
        }
        throw new RuntimeException("chain exception");
    }

    protected abstract boolean isCalculateConditionFulfilled(BinaryTreeNode<Integer> node, int nodeValue);

    protected abstract int calculateLogic(BinaryTreeNode<Integer> node, int nodeValue);
}
