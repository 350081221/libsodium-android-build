.class public interface abstract annotation Landroidx/annotation/RequiresFeature;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation runtime Ljava/lang/annotation/Retention;
    value = .enum Ljava/lang/annotation/RetentionPolicy;->SOURCE:Ljava/lang/annotation/RetentionPolicy;
.end annotation

.annotation runtime Ljava/lang/annotation/Target;
    value = {
        .enum Ljava/lang/annotation/ElementType;->TYPE:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->FIELD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->METHOD:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->CONSTRUCTOR:Ljava/lang/annotation/ElementType;,
        .enum Ljava/lang/annotation/ElementType;->ANNOTATION_TYPE:Ljava/lang/annotation/ElementType;
    }
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003R\u000f\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u000f\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Landroidx/annotation/RequiresFeature;",
        "",
        "name",
        "",
        "enforcement",
        "()Ljava/lang/String;",
        "annotation"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ln3/e;
    value = .enum Ln3/a;->SOURCE:Ln3/a;
.end annotation

.annotation runtime Ln3/f;
    allowedTargets = {
        .enum Ln3/b;->ANNOTATION_CLASS:Ln3/b;,
        .enum Ln3/b;->CLASS:Ln3/b;,
        .enum Ln3/b;->FIELD:Ln3/b;,
        .enum Ln3/b;->FUNCTION:Ln3/b;,
        .enum Ln3/b;->PROPERTY_GETTER:Ln3/b;,
        .enum Ln3/b;->PROPERTY_SETTER:Ln3/b;,
        .enum Ln3/b;->CONSTRUCTOR:Ln3/b;
    }
.end annotation


# virtual methods
.method public abstract enforcement()Ljava/lang/String;
.end method

.method public abstract name()Ljava/lang/String;
.end method
