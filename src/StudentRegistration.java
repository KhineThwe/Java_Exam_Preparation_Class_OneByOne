package app1;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class StudentRegistration {
	public static void main(String [] args) {
		
		JFrame frame = new JFrame("Student Registration Form");
		frame.setSize(600,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(20, 5, 20, 5);
		
		//Name
		gbc.gridx = 0; 
		gbc.gridy = 0;
		JLabel nameLabel = new JLabel("Enter Name:");
		frame.add(nameLabel,gbc);
		gbc.gridx = 1; 
		gbc.gridy = 0;
		JTextField nameField = new JTextField(20);
		frame.add(nameField,gbc);
		
		//Address
		gbc.gridx = 0; 
		gbc.gridy = 1;
		JLabel addressLabel = new JLabel("Enter Address:");
		frame.add(addressLabel,gbc);
		gbc.gridx = 1; 
		gbc.gridy = 1;
		JTextArea addressArea = new JTextArea(3, 20);
		addressArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		frame.add(addressArea,gbc);
		
		//Gender
		gbc.gridx = 0; 
		gbc.gridy = 2;
		JLabel genderLabel = new JLabel("Gender:");
		frame.add(genderLabel,gbc);
		gbc.gridx = 1;
        gbc.gridy = 2;
        JPanel genderPanel = new JPanel();
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        frame.add(genderPanel,gbc);
		
		//Hobbies
        gbc.gridx = 0; 
		gbc.gridy = 3;
		JLabel hobbieLabel = new JLabel("Hobbies:");
		frame.add(hobbieLabel,gbc);
		gbc.gridx = 1;
        gbc.gridy = 3;
		JPanel hobbiePanel = new JPanel();
		JCheckBox reading = new JCheckBox("Reading");
		JCheckBox sports = new JCheckBox("Sports");
		JCheckBox music = new JCheckBox("Music");
		hobbiePanel.add(reading);
		hobbiePanel.add(sports);
		hobbiePanel.add(music);
		frame.add(hobbiePanel,gbc);
		
		
		gbc.gridx = 0; 
		gbc.gridy = 4;
		JLabel countryLabel = new JLabel("Select Country:");
		frame.add(countryLabel,gbc);
		gbc.gridx = 1;
        gbc.gridy = 4;
        String[] countries = {"USA", "UK", "India", "Canada", "Germany"};
        JList<String> countryList = new JList<String>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        countryList.setVisibleRowCount(3);
        JScrollPane countryScrollPane = new JScrollPane(countryList);
        frame.add(countryScrollPane, gbc);
		
        
        gbc.gridx = 0; 
		gbc.gridy = 5;
		JLabel courseLabel = new JLabel("Select Course:");
		frame.add(courseLabel,gbc);
		gbc.gridx = 1;
        gbc.gridy = 5;
        String[] courses = {"Java", "Python", "C++"};
		JComboBox<String> courseCombo = new JComboBox<String>(courses);
		frame.add(courseCombo, gbc);
		
		
		gbc.gridx = 0; 
		gbc.gridy = 6;
		gbc.gridwidth = 2;
		JPanel buttonPanel = new JPanel();
		JButton submit = new JButton("SUBMIT");
		JButton show = new JButton("SHOW");
		JButton clear = new JButton("CLEAR");
		buttonPanel.add(submit);
		buttonPanel.add(show);
		buttonPanel.add(clear);
		frame.add(buttonPanel, gbc);
		
		
		gbc.gridx = 0; 
		gbc.gridy = 7;
		gbc.gridwidth = 2;
		JTextArea displayArea = new JTextArea(5, 40);
		displayArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		frame.add(displayArea, gbc);
		
		submit.addActionListener(e->{
			String name = nameField.getText().trim();
			String address = addressArea.getText().trim();
			String genter = "";
			String hobbies = "";
			if(maleRadio.isSelected()) {
				genter = "Male";
			}else {
				genter = "Female";
			}
			if(reading.isSelected()) hobbies +=  "Reading ";
			if(sports.isSelected()) hobbies += "Sports ";
			if(music.isSelected()) hobbies += "Music ";
			List<String> selectedCountries = countryList.getSelectedValuesList();
            String course = (String) courseCombo.getSelectedItem();
            
            if(name.equals("") || address.equals("") || genter.equals("") || hobbies.equals("") || course.equals("")) {
            	JOptionPane.showMessageDialog(frame, "Please fill all required fields.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            	return;
            }
            
            String message = "";
            message += "Name : " + name  ;
            message += "\nAddress : " + address  ;
            message += "\nGenter : " + genter  ;
            message += "\nHobbies : " + hobbies  ;
            message += "\nCourse : " +  String.join(", ", selectedCountries); 
            message += "\nCourse : " + course  ;
			
			JOptionPane.showMessageDialog(frame,message ,"Student Information",JOptionPane.INFORMATION_MESSAGE);
		});
		
		show.addActionListener(e->{
			String name = nameField.getText().trim();
			String address = addressArea.getText().trim();
			String genter = "";
			String hobbies = "";
			if(maleRadio.isSelected()) {
				genter = "Male";
			}else {
				genter = "Female";
			}
			if(reading.isSelected()) hobbies +=  "Reading ";
			if(sports.isSelected()) hobbies += "Sports ";
			if(music.isSelected()) hobbies += "Music ";
			List<String> selectedCountries = countryList.getSelectedValuesList();
            String course = (String) courseCombo.getSelectedItem();
            String message = "";
            message += "Name : " + name  ;
            message += "\nAddress : " + address  ;
            message += "\nGenter : " + genter  ;
            message += "\nHobbies : " + hobbies  ;
            message += "\nCourse : " +  String.join(", ", selectedCountries); 
            message += "\nCourse : " + course  ;
            displayArea.setText(message);
		});
		
		clear.addActionListener(e->{
			nameField.setText("");
			displayArea.setText("");
			addressArea.setText("");
			genderGroup.clearSelection();
            reading.setSelected(false);
            sports.setSelected(false);
            music.setSelected(false);
            countryList.clearSelection();
            courseCombo.setSelectedIndex(0);
		});
		
		
		
		frame.setVisible(true);
	}
}
