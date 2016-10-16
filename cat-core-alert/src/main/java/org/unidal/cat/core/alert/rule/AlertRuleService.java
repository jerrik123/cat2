package org.unidal.cat.core.alert.rule;

import java.util.List;
import java.util.Set;

import org.unidal.cat.core.alert.rules.entity.AlertRule;

public interface AlertRuleService {
   public Set<String> getAttributes(String type, String name);

   public List<AlertRule> getRulesWithAttribute(String type, String name, String value);

   public Set<String> getTypes();
}