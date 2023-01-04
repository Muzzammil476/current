apiVersion: v1
kind: Service
metadata: 
 - name: javaappsvc
   namespace: test-ns
spec:
 type: ClusterIP
 port:
  port: 80


