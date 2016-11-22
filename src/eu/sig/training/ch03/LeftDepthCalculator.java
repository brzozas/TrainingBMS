package eu.sig.training.ch03;

public class LeftDepthCalculator extends DepthCalculatorChain {

    public LeftDepthCalculator(final DepthCalculatorChain next) {
        super(next);
    }

    @Override
    protected boolean isCalculateConditionFulfilled(final BinaryTreeNode<Integer> node, final int nodeValue) {
        return nodeValue < node.getValue();
    }

    @Override
    protected int calculateLogic(final BinaryTreeNode<Integer> node, final int nodeValue) {
        BinaryTreeNode<Integer> left = node.getLeft();
        if (left == null) {
            throw new TreeException("Value not found in tree!");
        } else {
            return 1 + BinaryTreeSearch.calculateDepth(left, nodeValue);
        }
    }
}
