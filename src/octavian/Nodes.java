package octavian;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class Nodes extends ViewPart {
	public static final String ID = "octavian.nodes";

	private TableViewer viewer;
	
	class ViewContentProvider implements IStructuredContentProvider {}

	class ViewLabelProvider implements ITableLabelProvider {}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setInput(new String[] {"Local", "Korolev", "August"});
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		// TODO Auto-generated method stub
		viewer.getControl().setFocus();
	}
	
}
