package eu.sig.training.tree;

public class EqualDepthCalculator extends DepthCalculatorChain {

    public EqualDepthCalculator(final DepthCalculatorChain next) {
        super(next);
    }

    @Override
    protected boolean isCalculateConditionFulfilled(final BinaryTreeNode<Integer> node, final int nodeValue) {
        return node.getValue() == nodeValue;
    }

    @Override
    protected int calculateLogic(final BinaryTreeNode<Integer> node, final int nodeValue) {
        return 0;
    }
}
