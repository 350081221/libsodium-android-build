.class public interface abstract annotation Lkotlin/internal/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/internal/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2609
    name = "a"
.end annotation

.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->CONSTRUCTOR:Ljava/lang/annotation/ElementType;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/jvm/internal/n1;
.end annotation

.annotation runtime Ln3/e;
    value = .enum Ln3/a;->SOURCE:Ln3/a;
.end annotation

.annotation runtime Ln3/f;
    allowedTargets = {
        .enum Ln3/b;->CLASS:Ln3/b;,
        .enum Ln3/b;->FUNCTION:Ln3/b;,
        .enum Ln3/b;->PROPERTY:Ln3/b;,
        .enum Ln3/b;->CONSTRUCTOR:Ln3/b;,
        .enum Ln3/b;->TYPEALIAS:Ln3/b;
    }
.end annotation


# virtual methods
.method public abstract value()[Lkotlin/internal/p;
.end method
