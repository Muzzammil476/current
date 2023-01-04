apiVersion: v1
kind: Service
metadata: 
 - name: javaappsvc
   namespace: test-ns
spec:
 type: ClusterIP
 selector:
   apps: javapps
 port:
  port: 80


