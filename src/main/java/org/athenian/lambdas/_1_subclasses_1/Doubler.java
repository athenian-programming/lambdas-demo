package org.athenian.lambdas._1_subclasses_1;

public class Doubler
    extends TextConverter {

  @Override
  String convert(String text) {
    return text + text;
  }
}