package com.yiistorm;

import com.intellij.patterns.StandardPatterns;
import com.intellij.psi.PsiReferenceContributor;
import com.intellij.psi.PsiReferenceRegistrar;
import com.jetbrains.php.lang.psi.elements.PhpPsiElement;
import com.yiistorm.references.YiiPsiReferenceProvider;

public class MyPsiReferenceContributor extends PsiReferenceContributor {
    @Override
    public void registerReferenceProviders(PsiReferenceRegistrar registrar) {
        registrar.registerReferenceProvider(StandardPatterns.instanceOf(PhpPsiElement.class), new YiiPsiReferenceProvider());
    }
}
