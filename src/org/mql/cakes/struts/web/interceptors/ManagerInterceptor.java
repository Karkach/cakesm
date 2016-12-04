package org.mql.cakes.struts.web.interceptors;

import org.mql.cakes.struts.business.AnnonceBusiness;
import org.mql.cakes.struts.business.AnnonceManager;
import org.mql.cakes.struts.business.UtilisateurBusiness;
import org.mql.cakes.struts.business.UtilisateurManager;
import org.mql.cakes.struts.models.dao.AnnonceDaoHB;
import org.mql.cakes.struts.models.dao.UtilisateurDaoHB;
import org.mql.cakes.struts.web.actions.AnnonceAction;
import org.mql.cakes.struts.web.actions.UserAction;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class ManagerInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UtilisateurBusiness userManager;
	private AnnonceBusiness annonceManager;
	
	public void init() {
		userManager = new UtilisateurManager(new UtilisateurDaoHB());
		annonceManager = new AnnonceManager(new AnnonceDaoHB());
		System.out.println(getClass().getName()+".init()");
	}
	
	public String intercept(ActionInvocation inv) throws Exception {
		if (inv.getAction()  instanceof UserAction) {
			UserAction userAction  =  (UserAction) inv.getAction() ;
			userAction.setuBusiness(userManager);	 
		}
		if (inv.getAction()  instanceof AnnonceAction) {
			AnnonceAction  annonceAction =  (AnnonceAction) inv.getAction() ;
			annonceAction.setaBusiness(annonceManager);
		}
		return inv.invoke();
	}

}
