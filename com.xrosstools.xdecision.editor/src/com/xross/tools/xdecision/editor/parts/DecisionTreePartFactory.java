package com.xross.tools.xdecision.editor.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import com.xross.tools.xdecision.editor.model.DecisionTreeDiagram;
import com.xross.tools.xdecision.editor.model.DecisionTreeNode;
import com.xross.tools.xdecision.editor.model.DecisionTreeNodeConnection;

public class DecisionTreePartFactory implements EditPartFactory {
	public EditPart createEditPart(EditPart context, Object model) {
		EditPart part = null;
		
		if(model == null)
			part = null;
		
		if(model instanceof DecisionTreeDiagram)
			part = new DecisionTreeDiagramPart();
		else
		if(model instanceof DecisionTreeNode)
			part = new DecisionTreeNodePart();
		else
		if(model instanceof DecisionTreeNodeConnection)
			part = new DecisionTreeNodeConnectionPart();
		
		part.setModel(model);
		
		return part;
	}
}
