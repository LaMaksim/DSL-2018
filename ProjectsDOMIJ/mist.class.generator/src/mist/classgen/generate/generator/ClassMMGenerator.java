package mist.classgen.generate.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import FileTransferPackage.FileTransferPackagePackage;
import FileTransferPackage.Model;

public class ClassMMGenerator {

	public static void generateAll(String inputPath, String outputDirectory) {
		//open directory chooser
		if (outputDirectory != null) {
			Model cm = loadFETLModel(inputPath);
			System.out.println(cm.getExecutions().get(0));
			
		}

	}

	private static Model loadFETLModel(String modulePath) {
		// Initialize the model
		FileTransferPackagePackage.eINSTANCE.eClass();

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		m.put("ecore", new EcoreResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createFileURI(modulePath), true);
		//Resource resource = resSet.getResource(URI.createURI("class/ClassModel.xmi"), true);

		// Get the first model element and cast it to the right type, in my
		// example everything is included in this first node
		Model pkg = (Model) resource.getContents().get(0);

		return pkg;
	}

	private static void saveFile(String path, CharSequence cs) {
		File output = new File(path);
		PrintWriter pw = null;
		try {
			if (output.getParentFile() != null) {
				output.getParentFile().mkdirs();
			}			
			output.createNewFile();
			pw = new PrintWriter(new FileOutputStream(output));
			pw.print(cs);

			System.out.println("saved " + path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}
	
	public static void main(String[] args) {
//		FETLToXMIConverter.convertFETLtoXMI("input/proba11.fetl", "output/proba11.xmi");
		ClassMMGenerator.generateAll("output/proba11.xmi", "/output");
	}
}
