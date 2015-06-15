package octavian;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

//import org.eclipse.jface.dialogs.IDialogSettings;
//import org.eclipse.jface.viewers.IStructuredSelection;
//import org.eclipse.jface.wizard.IWizardContainer;
//import org.eclipse.jface.wizard.IWizardPage;
//import org.eclipse.swt.graphics.Image;
//import org.eclipse.swt.graphics.RGB;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.ui.IWorkbench;
//import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
//import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;


public class NewProject extends Wizard implements INewWizard {
	static public String NAME="Проект Octavian"; 

	@Override public void init(IWorkbench workbench, IStructuredSelection selection) {}
	@Override public boolean performFinish() { return false; }
	@Override public boolean canFinish() { return false; }
	
	public NewProject() {
		super();
		setNeedsProgressMonitor(true);
	}	
	
	private CreateAppPage firstPage;
	@Override
    public void addPages() {
        firstPage = new CreateAppPage();
        addPage(firstPage);
    }

	class CreateAppPage extends WizardPage {
		
		private Composite container;

		CreateAppPage() {
			super("super");
			setTitle(NAME);
		}

		@Override
		public void createControl(Composite parent) {
			container = new Composite(parent, SWT.NONE);
			// GridLayout layout = new GridLayout();
			// container.setLayout(layout);
			// layout.numColumns = 2;
			// Label lblTestName = new Label(container, SWT.NONE);
			// lblTestName.setText("Application name:");
			// testName = new Text(container, SWT.BORDER | SWT.SINGLE |
			// SWT.FILL);
			// testName.addKeyListener(pageComplete);
			// GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			// testName.setLayoutData(gd);
			setControl(container);
			setPageComplete(false);
		}
	}

}

//extends BasicNewProjectResourceWizard implements org.eclipse.ui.INewWizard {
//	private static final String WIZARD_NAME = "Octavian.NewProject";
//	
//	private WizardNewProjectCreationPage page1;
//	
//	public NewProject() { setWindowTitle(WIZARD_NAME); }
//
//	@Override
//	public void addPages() {
//		super.addPages();
//		page1 = new WizardNewProjectCreationPage("From Scratch Project Wizard");
//		page1.setTitle("From Scratch Project");
//		page1.setDescription("Create something from scratch.");
//	    addPage(page1);		
//	}
//
//	@Override
//	public boolean canFinish() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public void createPageControls(Composite pageContainer) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void dispose() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public IWizardContainer getContainer() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Image getDefaultPageImage() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IDialogSettings getDialogSettings() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IWizardPage getNextPage(IWizardPage page) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IWizardPage getPage(String pageName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int getPageCount() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public IWizardPage[] getPages() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IWizardPage getPreviousPage(IWizardPage page) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public IWizardPage getStartingPage() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public RGB getTitleBarColor() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getWindowTitle() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean isHelpAvailable() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean needsPreviousAndNextButtons() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean needsProgressMonitor() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean performCancel() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean performFinish() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public void setContainer(IWizardContainer wizardContainer) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void init(IWorkbench workbench, IStructuredSelection selection) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
