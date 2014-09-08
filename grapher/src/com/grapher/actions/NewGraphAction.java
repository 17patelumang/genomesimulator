package com.grapher.actions;


/**
 * @author Umang Patel<ujp2001@columbia.edu>
 */


import org.eclipse.jface.action.Action;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;

import com.grapher.View;
import com.grapher.ui.GenerationGraph;
import com.grapher.ui.MyTitleAreaDialog;

public class NewGraphAction extends Action {
	
    public NewGraphAction(IWorkbenchWindow window, String label) {
            setText(label);
            setId("grapher.newgraph");
    }
    
    public void run() {

    	View v = GenerationGraph.getInstance().getMainView();
    	v.newGraph();
    }
}
