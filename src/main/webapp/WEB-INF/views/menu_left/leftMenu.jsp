<%@ include file="/WEB-INF/views/includes/includes.jsp"%>
<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li class="sidebar-search">
				<div class="input-group custom-search-form">
					<input type="text" class="form-control" placeholder="Search...">
					<span class="input-group-btn">
						<button class="btn btn-default" type="button">
							<i class="fa fa-search"></i>
						</button>
					</span>
				</div> <!-- /input-group -->
			</li>
			<li><a href="index.html"><i class="fa fa-dashboard fa-fw"></i>
					<fmt:message key="common.dashbord" /> </a></li>
			<li><a href="index.html"><i class="fa fa-dashboard fa-fw"></i>
					<fmt:message key="common.article" /> </a></li>
			<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> <fmt:message
						key="common.client" /><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="flot.html"> <fmt:message key="common.client" />
					</a></li>
					<li><a href="flot.html"> <fmt:message key="common.client.commande" />
					</a></li>					
				</ul> <!-- /.nav-second-level --></li>
				
				
				<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> <fmt:message
						key="common.fournisseur" /><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="flot.html"> <fmt:message key="common.fournisseur" />
					</a></li>
					<li><a href="flot.html"> <fmt:message key="common.fournisseur.commande" />
					</a></li>					
				</ul> <!-- /.nav-second-level --></li>
				
				
				
				
				
			<li><a href="tables.html"><i class="fa fa-table fa-fw"></i>
					
					<fmt:message key="common.stock" />
					</a></li>
			<li><a href="forms.html"><i class="fa fa-edit fa-fw"></i>
					<fmt:message key="common.vente" />
					</a></li>
			<li><a href="#"><i class="fa fa-wrench fa-fw"></i>
					<fmt:message key="common.parametrage" />
					<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="panels-wells.html">
					<fmt:message key="common.parametrage.utilisateur" />
					</a></li>
					<li><a href="buttons.html">
					<fmt:message key="common.parametrage.categorie" />
					</a></li>
					<li><a href="notifications.html">
					<fmt:message key="common.parametrage" />
					</a></li>
					
				</ul> <!-- /.nav-second-level --></li>
			
		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>