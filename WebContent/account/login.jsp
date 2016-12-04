<%@ taglib uri="/struts-tags" prefix="s" %>
<div id="loginBloc">
	<div id ="formLogin">
		<div style="padding: 10px 0px; background: #c5c5c5;">
		<img src="<%= request.getContextPath()%>/images/iw.png" style=" width: 127px; height: 127px;" />
		<h3>Connexion</h3>
		<p>Pas encore inscrit? 
		<s:a action="inscription" namespace="/account" style="color: #Ca3030;">S'inscrire gratuitement</s:a>
		</p>
		</div>
		
		<s:form style="padding: 10px 20px; " action="login" namespace="/account">
			<s:textfield name="u.mail" label="E-mail" cssClass="field" placeholder="Exemple@gmail.com"/>
			<s:password name="u.motDePasse" label="Mot de passe" cssClass="field" placeholder="********"/>
			<s:submit value="Connexion " cssClass="buttonGeneral"/>
		</s:form>
		<div class="divError" style="border-radius: 0px;">
			<s:actionerror />
		</div>
      	<div id="confidentialite">
	      	Vous n'avez pas encore de compte?
				<s:a action="inscription" namespace="/account">S'inscrire gratuitement</s:a>
      	</div>
	</div>
</div>