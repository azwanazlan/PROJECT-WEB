<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>User</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>31191d1e-799b-4875-9b25-366b5aec9c1e</testSuiteGuid>
   <testCaseLink>
      <guid>51a0523f-a1cb-40ab-a9f7-571ae345f4c2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Search Users/Positive/Users enter valid username</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>e940a66e-91ab-4e11-a798-d7d2cb69226d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Search Users/Negative/Users enter invalid username</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>c7241a70-9a75-47ec-9c2f-6ff4f0128b89</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Add New Account/Positive/Successfully add new user</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>b3d58ae6-9faa-4698-8211-7dd575014fea</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Username and Password</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>b3d58ae6-9faa-4698-8211-7dd575014fea</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>5dfc03fb-f1b4-407c-a859-6565e0cf2d6a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>b3d58ae6-9faa-4698-8211-7dd575014fea</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>afb35764-61b9-4709-93a8-afee1e638f8b</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>9a481a3e-f7f9-47e5-b70d-32378fb64245</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Add New Account/Negative/Users enter an unregistered employee name</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>f7f4e32c-58c0-4e56-9976-cba24d6fbc00</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Add New Account/Negative/Users enter less than five characters for username</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>afb3ba34-a51b-483e-abaa-8634a4fec9f3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Add New Account/Negative/Users enter the registered username</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>0a7716b2-b175-4bd3-92e9-372727978908</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Add New Account/Negative/Users enter less than eight characters for password</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>c4000922-2785-46a4-b430-a4586c15e939</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Add New Account/Positive/User did not enter alphanumeric number for password</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>97e5b28b-72f2-490d-9efe-94cf69c9d09a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Add New Account/Negative/Password confirmation doesnt match password</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>7fe87fb3-a0c5-4047-8db5-4b604a1e053e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Add New Account/Negative/Users leave the form blank</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>0125642e-88da-438a-b7a0-939dcceb1032</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Delete Account/Positive/Successfully delete account</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>58951325-4fe4-428d-8ff9-96d5a14ab09c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PROJECT WEB/Orange HRM/User/Delete Account/Positive/Users delete more than one account</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
