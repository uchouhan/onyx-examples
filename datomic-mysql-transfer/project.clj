(defproject datomic-mysql-transfer "0.1.0"
  :description "Sample: Mysql to Datomic transfer"
  :url "http://onyxplatform.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/java.jdbc "0.4.2"]
                 [com.datomic/datomic-free "0.9.5173"]
                 [org.onyxplatform/onyx "0.8.0"]
                 [org.onyxplatform/onyx-datomic "0.8.0.1"]
                 [org.onyxplatform/onyx-sql "0.8.0.1"]
                 [com.mchange/c3p0 "0.9.2.1"]
                 [mysql/mysql-connector-java "5.1.27"]
                 [honeysql "0.4.3"]])
