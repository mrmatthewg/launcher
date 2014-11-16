package mjay.launcher;

private ListView list;    
private void loadListView(){    
	
	list = (ListView)findViewById(R.id.apps_list);         
	ArrayAdapter<AppDetail> adapter = new ArrayAdapter<AppDetail>(this,R.layout.list_item,apps) {        
		@Override        
		public View getView(int position, View convertView, ViewGroup parent) {
			
			if(convertView == null){                
				convertView = getLayoutInflater().inflate(R.layout.list_item,             
						}  
			
			ImageView appIcon = (ImageView)convertView.findViewById(R.id.item_app_icon);            
			appIcon.setImageDrawable(apps.get(position).icon);                         
			TextView appLabel = (TextView)convertView.findViewById(R.id.item_app_label);            
			appLabel.setText(apps.get(position).label);                         
			TextView appName = (TextView)convertView.findViewById(R.id.item_app_name);            
			appName.setText(apps.get(position).name);                         
			return convertView;        }    
		};         
		list.setAdapter(adapter);           
		}
}