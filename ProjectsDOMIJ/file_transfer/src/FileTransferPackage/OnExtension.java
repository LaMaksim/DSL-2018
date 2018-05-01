/**
 */
package FileTransferPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.OnExtension#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getOnExtension()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExtensionsContent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ExtensionsContent='\n\t\t\textensions->forAll(ex:String |  ex.matches(\'[a-zA-Z][a-zA-Z0-9]*\') )' ExtensionsContent$message='\'Tags must be regular identifiers\''"
 * @generated
 */
public interface OnExtension extends OnBasic {
	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' attribute list.
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnExtension_Extensions()
	 * @model
	 * @generated
	 */
	EList<String> getExtensions();

} // OnExtension
