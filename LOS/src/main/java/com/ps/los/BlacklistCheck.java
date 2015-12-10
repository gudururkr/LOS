package com.ps.los;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class BlacklistCheck implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Blacklist Report")
   private org.jbpm.document.Document blackListReportDocument;
   @org.kie.api.definition.type.Label("Central Bank Blackliist Check")
   private java.lang.String centralBankBlackliistCheck;
   @org.kie.api.definition.type.Label("Amount")
   private java.lang.Double amount;

   public BlacklistCheck()
   {
   }

   public org.jbpm.document.Document getBlackListReportDocument()
   {
      return this.blackListReportDocument;
   }

   public void setBlackListReportDocument(
         org.jbpm.document.Document blackListReportDocument)
   {
      this.blackListReportDocument = blackListReportDocument;
   }

   public java.lang.String getCentralBankBlackliistCheck()
   {
      return this.centralBankBlackliistCheck;
   }

   public void setCentralBankBlackliistCheck(
         java.lang.String centralBankBlackliistCheck)
   {
      this.centralBankBlackliistCheck = centralBankBlackliistCheck;
   }

   public java.lang.Double getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Double amount)
   {
      this.amount = amount;
   }

   public BlacklistCheck(org.jbpm.document.Document blackListReportDocument,
         java.lang.String centralBankBlackliistCheck, java.lang.Double amount)
   {
      this.blackListReportDocument = blackListReportDocument;
      this.centralBankBlackliistCheck = centralBankBlackliistCheck;
      this.amount = amount;
   }

}