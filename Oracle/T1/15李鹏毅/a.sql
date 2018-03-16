15:54:56 SQL> show sga;

Total System Global Area 1653518336 bytes                                       
Fixed Size                  2176288 bytes                                       
Variable Size            1040190176 bytes                                       
Database Buffers          603979776 bytes                                       
Redo Buffers                7172096 bytes                                       
15:55:02 SQL> select name from v$database;

NAME                                                                            
------------------                                                              
ORCL                                                                            

15:55:14 SQL> spool off;
