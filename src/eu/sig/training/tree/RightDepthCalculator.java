package eu.sig.training.tree;

public class RightDepthCalculator extends DepthCalculatorChain {

    public RightDepthCalculator(final DepthCalculatorChain next) {
        super(next);
    }

    @Override
    protected boolean isCalculateConditionFulfilled(final BinaryTreeNode<Integer> node, final int nodeValue) {
        return true;
    }

    @Override
    protected int calculateLogic(final BinaryTreeNode<Integer> node, final int nodeValue) {
        BinaryTreeNode<Integer> right = node.getRight();
        if (right == null) {
            throw new TreeException("Value not found in tree!");
        } else {
            return 1 + BinaryTreeSearch.calculateDepth(right, nodeValue);
        }
    }
}
