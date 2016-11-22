package eu.sig.training.ch03;

import eu.sig.training.Precondition;
import eu.sig.training.ch03.TreeException;
import eu.sig.training.ch03.BinaryTreeNode;

public class BinaryTreeSearch {

    private static final DepthCalculatorChain depthCalculatorChain = new EqualDepthCalculator(new LeftDepthCalculator(new RightDepthCalculator(null)));
	
    // tag::calculateDepth[]
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        Precondition.checkArgument(node != null, "A reference to argument 'node' was not specified");
    	return depthCalculatorChain.calculate(node, nodeValue);
    }
    // end::calculateDepth[]



}
