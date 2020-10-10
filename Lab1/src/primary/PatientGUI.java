package primary;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.PrintWriter;

public class PatientGUI extends JFrame {

	ArrayList<Patient> plist;

	public PatientGUI(ArrayList<Patient> list) {

		plist = list;

		createPatientUI();

	}

	private void createPatientUI() {
		{
			JFrame jframe = new JFrame("Patient GUI");

			jframe.setLayout(null);

			// ID
			JLabel pld = new JLabel("Patient's ID");

			pld.setBounds(10, 50, 150, 20);
			
			String[] patIDs = new String[plist.size()];
			for (Patient p : plist) {
				patIDs[p.id - 1] = Integer.toString(p.id);
			}

			JComboBox<String> pidDropDown = new JComboBox<String>(patIDs);

			pidDropDown.setBounds(200, 50, 150, 20);

			// Name
			JLabel pName = new JLabel("Name ");

			pName.setBounds(10, 80, 150, 20);

			JTextField pNametxt = new JTextField("");

			pNametxt.setBounds(200, 80, 150, 20);

			// Age
			JLabel pAge = new JLabel("Age ");

			pAge.setBounds(10, 110, 150, 20);

			JTextField pAgetxt = new JTextField("");

			pAgetxt.setBounds(200, 110, 150, 20);
			
			// Weight
			JLabel pWeight = new JLabel("Weight ");

			pWeight.setBounds(10, 140, 150, 20);

			JTextField pWeighttxt = new JTextField("");

			pWeighttxt.setBounds(200, 140, 150, 20);
			
			// Doctor
			JLabel pDoctor = new JLabel("Doctor ");

			pDoctor.setBounds(10, 170, 150, 20);

			JTextField pDoctortxt = new JTextField("");

			pDoctortxt.setBounds(200, 170, 150, 20);
			;
			
			// Print button
			JButton printToFileButton = new JButton("Print To File");

			printToFileButton.setBounds(10, 250, 150, 20);

			// Populate button
			JButton populateButton = new JButton("Populate Patient's Details");

			populateButton.setBounds(10, 275, 250, 20);
			
			// Exit button
			JButton exitButton = new JButton("Exit");
			
			exitButton.setBounds(10, 310, 75, 20);

			printToFileButton.addActionListener(new ActionListener() {

				@Override

				public void actionPerformed(ActionEvent e) {

					// Get selected name from combox as shown below

					int id = Integer.parseInt((String) pidDropDown.getSelectedItem());

					// go through the Player array list,

					// print the details of the selected Player to a file.
					for (Patient p : plist) {

						if (id == p.id) {

							try {
								PrintWriter fw = new PrintWriter("patient.txt");
								fw.write(p.toString());

								fw.close();
							} catch (Exception ec) {

								System.out.println(" " + ec);

							}

						}

					}
				}

			}

			);

			populateButton.addActionListener(new ActionListener() {

				@Override

				public void actionPerformed(ActionEvent e) {

					// Get selected name from combox, go through the Player array list,

					int id = Integer.parseInt((String) pidDropDown.getSelectedItem());
					
					for (Patient p : plist) {
						
						if (id == p.id) {

							pNametxt.setText(p.name);
							pAgetxt.setText(Integer.toString(p.age));
							pWeighttxt.setText(Integer.toString(p.weight));
							pDoctortxt.setText(p.doctor);

						}

					}

					// and populate the GUI with proper details

				}

			}
			
			);
			
			exitButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					System.exit(0);
					
				}
				
			}
			
			);

			jframe.add(pld);

			jframe.add(pidDropDown);

			jframe.add(pName);

			jframe.add(pNametxt);
			
			jframe.add(pAge);
			
			jframe.add(pAgetxt);
			
			jframe.add(pWeight);
			
			jframe.add(pWeighttxt);
			
			jframe.add(pDoctor);
			
			jframe.add(pDoctortxt);

			jframe.add(populateButton);

			jframe.add(printToFileButton);
			
			jframe.add(exitButton);

			jframe.setSize(400, 400);

			jframe.setVisible(true);

			jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}
	}
}