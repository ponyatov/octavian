package octavian;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.PlatformUI;

public class Perspective implements IPerspectiveFactory {
	public static final String ID = "octavian.perspective";
	
	public static IPerspectiveRegistry REG;
	public static IPerspectiveDescriptor DESC;
	
	public Perspective() {
		REG=PlatformUI.getWorkbench().getPerspectiveRegistry();
		DESC=PlatformUI.getWorkbench().getPerspectiveRegistry().findPerspectiveWithId(ID);
	}

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		REG.revertPerspective(DESC);
	}

}
