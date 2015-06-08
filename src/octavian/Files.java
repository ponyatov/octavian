package octavian;

public class Files extends org.eclipse.ui.navigator.CommonNavigator {
	public static final String ID = "octavian.files";
}

//import java.io.File;
//
//import org.eclipse.jface.viewers.BaseLabelProvider;
//import org.eclipse.jface.viewers.ITableLabelProvider;
//import org.eclipse.jface.viewers.ITreeContentProvider;
//import org.eclipse.jface.viewers.TreeViewer;
//import org.eclipse.jface.viewers.Viewer;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.graphics.Image;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.ui.part.ViewPart;
//
//public class Files extends ViewPart {
//	public static final String ID = "octavian.files";
//
//	private TreeViewer viewer;
//
//	class Content implements ITreeContentProvider {
//
//		@Override
//		public void dispose() {
//		}
//
//		@Override
//		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
//		}
//
//		@Override
//		public Object[] getElements(Object inputElement) {
//			return (File[]) inputElement;
//		}
//
//		@Override
//		public Object[] getChildren(Object parentElement) {
//			File file = (File) parentElement;
//			return file.listFiles();
//		}
//
//		@Override
//		public Object getParent(Object element) {
//			File file = (File) element;
//			return file.getParentFile();
//		}
//
//		@Override
//		public boolean hasChildren(Object element) {
//			File file = (File) element;
//			if (file.isDirectory()) return true;
//			return false;
//		}
//	}
//	
//	class Label extends BaseLabelProvider implements ITableLabelProvider {
//
//		@Override
//		public Image getColumnImage(Object element, int columnIndex) {
//			return null;
//		}
//
//		@Override
//		public String getColumnText(Object element, int columnIndex) {
//			return element.toString();
////			if (columnIndex == 0)
////				return ((File) element).getName();
////			else
////				return toString(((Composite) element).getChildren().length);
//		}
//	}
//
//	@Override
//	public void createPartControl(Composite parent) {
//		viewer = new TreeViewer(parent,SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
//		viewer.setContentProvider(new Content());
//		viewer.setLabelProvider(new Label());
//		viewer.setInput(File.listRoots());
//	}
//
//	@Override
//	public void setFocus() {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
