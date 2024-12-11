package leetcode.exercises;

import java.util.*;
import java.util.Map.Entry;

public class SubDomainVisitCount {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String[] cpdomains = {"9001 discuss.leetcode.com"};
//		List<String> result = getSubdomainsVisited(cpdomains);
//		
//		result.forEach(System.out::println);
//		
//
//	}

	public static List<String> subdomainVisits(String[] cpdomains) {
		Map<String, Integer> domainCountMap = new HashMap<>();

		for (String cpdomain : cpdomains) {
			String[] parts = cpdomain.split(" ");
			int count = Integer.parseInt(parts[0]);
			String domain = parts[1];

			String[] subdomains = domain.split("\\.");
			String currDomain = "";

			for (int i = subdomains.length - 1; i >= 0; i--) {
				currDomain = subdomains[i] + (currDomain.equals("") ? "" : ".") + currDomain;
				domainCountMap.put(currDomain, domainCountMap.getOrDefault(currDomain, 0) + count);
			}
		}

		List<String> result = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : domainCountMap.entrySet()) {
			result.add(entry.getValue() + " " + entry.getKey());
		}

		return result;
	}

}
