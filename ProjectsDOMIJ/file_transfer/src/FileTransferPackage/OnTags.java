/**
 */
package FileTransferPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Tags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link FileTransferPackage.OnTags#getTags <em>Tags</em>}</li>
 *   <li>{@link FileTransferPackage.OnTags#isOnly <em>Only</em>}</li>
 *   <li>{@link FileTransferPackage.OnTags#getTreshold <em>Treshold</em>}</li>
 * </ul>
 * </p>
 *
 * @see FileTransferPackage.FileTransferPackagePackage#getOnTags()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TagsTresholdNumberPositiveMinus1 TagsContent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot TagsTresholdNumberPositiveMinus1='\n\t\t\ttreshold>=-1' TagsTresholdNumberPositiveMinus1$message='\'Treshold must be positive or 0 or -1\'' TagsContent='\n\t\t\ttags->forAll(tg:String |  tg.matches(\'[a-zA-Z][a-zA-Z0-9]*\') )' TagsContent$message='\'Tags must be regular identifiers\''"
 * @generated
 */
public interface OnTags extends OnCustom {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnTags_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only</em>' attribute.
	 * @see #setOnly(boolean)
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnTags_Only()
	 * @model default="false"
	 * @generated
	 */
	boolean isOnly();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnTags#isOnly <em>Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only</em>' attribute.
	 * @see #isOnly()
	 * @generated
	 */
	void setOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Treshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treshold</em>' attribute.
	 * @see #setTreshold(int)
	 * @see FileTransferPackage.FileTransferPackagePackage#getOnTags_Treshold()
	 * @model required="true"
	 * @generated
	 */
	int getTreshold();

	/**
	 * Sets the value of the '{@link FileTransferPackage.OnTags#getTreshold <em>Treshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treshold</em>' attribute.
	 * @see #getTreshold()
	 * @generated
	 */
	void setTreshold(int value);

} // OnTags
