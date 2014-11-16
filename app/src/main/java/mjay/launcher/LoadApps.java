package mjay.launcher;

private PackageManager manager; 
private List<AppDetail> apps; 

private void loadApps(){    
	
	manager = getPackageManager();    
	apps = new ArrayList<AppDetail>();         
	Intent i = new Intent(Intent.ACTION_MAIN, null);    
	i.addCategory(Intent.CATEGORY_LAUNCHER);         
	
	List<ResolveInfo> availableActivities = manager.queryIntentActivities(i,     
			
			for(ResolveInfo ri:availableActivities){        
				
				AppDetail app = new AppDetail();        
				app.label = ri.loadLabel(manager);        
				app.name = ri.activityInfo.packageName;        
				app.icon = ri.activityInfo.loadIcon(manager);        
				apps.add(app);    
				
			} 
	
}