package com.jspring.myproject.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.bean.CsvToBeanBuilder;

/**
 * @author jithi
 *
 */

@RestController
public class FlightService {

	@GetMapping("flight/{inputDate}")
	public List getWeekDay(@PathVariable String inputDate) {
		int dayOfWeek = getDay(inputDate);
		List flightdetails = getFlights(dayOfWeek);
		return flightdetails;
	}

	/**
	 * This method to get day of the week
	 *
	 */

	public int getDay(String inputDate) {

		System.out.println("Date--->" + inputDate);
		DayOfWeek dayofWeeks = LocalDate.parse(inputDate).getDayOfWeek();
		System.out.println("Day of week in text:sss--->" + dayofWeeks.getValue());

		return dayofWeeks.getValue();
	}


	/**
	 * This method to get filtered flight based on the day of the week
	 *
	 */

	public List getFlights(int dayOfWeek) {

		String csvFile = "C:\\\\Users\\\\jithi\\\\Downloads\\\\airport-app-data-master\\\\flights.csv";
		List<FlightData> beans;
		List<FlightData> flightdetails;
		List<FlightData> filteredbean = new ArrayList<>();

		try {
			beans = new CsvToBeanBuilder(new FileReader(csvFile)).withType(FlightData.class).build().parse();

			for (FlightData bean : beans) {

				switch (dayOfWeek) {
				case 7: {
					if (bean.getSunday().equals("x")) {
						filteredbean.add(bean);
					}
					break;
				}
				case 1: {
					if (bean.getMonday().equals("x")) {
						filteredbean.add(bean);
					}
					break;
				}
				case 2: {
					if (bean.getTuesday().equals("x")) {
						filteredbean.add(bean);
					}
					break;
				}

				case 3: {
					if (bean.getWednesday().equals("x")) {
						filteredbean.add(bean);
					}
					break;
				}
				case 4: {
					if (bean.getThursday().equals("x")) {
						filteredbean.add(bean);
					}
					break;
				}
				case 5: {
					if (bean.getFriday().equals("x")) {
						filteredbean.add(bean);
					}
				}
				case 6: {
					if (bean.getSaturday().equals("x")) {
						filteredbean.add(bean);
					}
					break;
				}

				}
			}

		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		filteredbean.forEach(System.out::println);

		return filteredbean;
	}

}
