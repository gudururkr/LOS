package com.ps.los;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DeviationBlacklistCheck implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Central Bank Blackliist Check")
   private java.lang.String centralBankBlackliistCheck;
   @org.kie.api.definition.type.Label("Amount")
   private java.lang.Double amount;
   @org.kie.api.definition.type.Label("\t Blacklist Report")
   private org.jbpm.document.Document blackListReportDocument;

   @org.kie.api.definition.type.Label(value = "Status")
   private java.lang.String status;

   @org.kie.api.definition.type.Label(value = "Description")
   private java.lang.String description;

   public DeviationBlacklistCheck()
   {
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

   public org.jbpm.document.Document getBlackListReportDocument()
   {
      return this.blackListReportDocument;
   }

   public void setBlackListReportDocument(
         org.jbpm.document.Document blackListReportDocument)
   {
      this.blackListReportDocument = blackListReportDocument;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }

   public void setDescription(java.lang.String description)
   {
      this.description = description;
   }

   public DeviationBlacklistCheck(java.lang.String centralBankBlackliistCheck,
         java.lang.Double amount,
         org.jbpm.document.Document blackListReportDocument,
         java.lang.String status, java.lang.String description)
   {
      this.centralBankBlackliistCheck = centralBankBlackliistCheck;
      this.amount = amount;
      this.blackListReportDocument = blackListReportDocument;
      this.status = status;
      this.description = description;
   }

}